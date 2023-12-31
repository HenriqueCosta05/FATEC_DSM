const bodyParser = require("body-parser")
const express = require("express")
const app = express()
const handlebars = require("express-handlebars").engine
const post = require("./models/post")

app.engine("handlebars", handlebars({defaultLayout: "main"}))
app.set("view engine", "handlebars")

app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json())

app.get("/", (req, res) => {
    res.render("primeira_pagina")
})

app.get("/excluir/:id", (req, res) => {
    post.destroy({where:{'id': req.params.id}}).then(()=>{
        res.render("primeira_pagina")
    }).catch((erro)=>{
        console.log("Erro ao excluir ou encontrar os dados do banco: " + erro)
    })
})

app.get("/editar/:id", (req,res)=>{
    post.findAll({where: {'id': req.params.id}}).then((post)=>{
        res.render("editar", {post})
    }).catch((erro)=>{
        console.log("Erro ao carregar dados do banco: " + erro)
    })
})

app.post("/atualizar", (req, res)=>{
    post.update({
        nome: req.body.nome,
        endereco: req.body.endereco,
        bairro: req.body.bairro,
        cep: req.body.cep
    },{
        where:{
            id: req.body.id
        }
    }).then(()=>{
        res.redirect("/consulta")
    })
})

app.get("/consulta", (req, res) => {
    post.findAll().then(function(post){
        res.render("consulta", {post})
    }).catch((erro)=>{
        console.log("Erro ao carregar dados do banco: " + erro)
    })
})

app.post("/cadastrar", (req, res) => {
    post.create({
        nome: req.body.nome,
        endereco: req.body.endereco,
        bairro: req.body.bairro,
        cep: req.body.cep

    }).then(() => {
        console.log("Dados cadastrados com sucesso!")
        res.send("Cadastro realizado com sucesso!")
    }).catch((erro) => {
        console.log("Erro ao cadastrar: " + erro)
    })
})

app.listen(8081, () => {
    console.log("Servidor Ativo!")
})