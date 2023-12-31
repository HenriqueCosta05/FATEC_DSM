const express = require("express")
const app = express()

//Criação da Rota 1
app.get("/", function (req, res) {
    res.sendFile(__dirname + "/html/index.html")
})

//Criação da Rota 2
app.get("/contato", (req, res)=>{
    res.send("Página de Contato!")
})

//Criação da Rota 3
app.get("/produto", (req, res)=>{
    res.send("Página de Produto!")
})

//Criação da Rota 4
app.get("/produto/:item/:quantidade", (req, res)=> {
    res.send("Item: " + req.params.item + "<br>Quantidade: " + req.params.quantidade)
})

//Inicialização do Servidor
app.listen(8081, () => {
    console.log("Servidor Ativo!")
})
