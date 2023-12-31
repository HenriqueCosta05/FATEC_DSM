const express = require("express")
const app = express()

const Sequelize = require("sequelize")
const sequelize = new Sequelize("ProjetoWeb", "root", "", {
    host: "localhost",
    dialect: "mysql"
})

sequelize.authenticate().then(()=>{
    console.log("Conexão realizada com sucesso!")
}).catch((erro)=>{
    console.log("Falha ao conectar: " + erro)
})

const Agendamentos = sequelize.define("agendamentos", {
    nome: {
        type: Sequelize.STRING
    },
    endereco:{
        type: Sequelize.STRING
    },
    bairro: {
        type: Sequelize.STRING
    }, 
    cep: {
        type: Sequelize.STRING
    },
    cidade: {
        type: Sequelize.STRING
    },
    estado:{
        type: Sequelize.STRING
    },
    observacao:{
        type: Sequelize.TEXT
    }
})

//Agendamentos.sync({force: true})

app.get("/", (req, res)=>{
    res.send("Tela inicial")
})

app.get("/cadastrar/:nome/:endereco/:bairro/:cep/:cidade/:estado/:observacao", (req, res)=>{
    Agendamentos.create({
        nome: req.params.nome,
        endereco: req.params.endereco,
        bairro: req.params.bairro,
        cep: req.params.cep,
        cidade: req.params.cidade,
        estado: req.params.estado,
        observacao: req.params.observacao
    })
    res.redirect("/")
})

app.listen(8081, ()=>{
    console.log("Servidor Web carregado!")
})
