let cadastrar = () => {
    // recuperar os dados do usuário e já cria o objeto
    // vamos utilizar programação DOM (document object model)

    let paciente
    let verbo
    if (id) { // vai atualizar
        paciente = {
            id: document.getElementById("id").value, 
            nome: document.getElementById("nome").value,
            cpf: document.getElementById("cpf").value,
            altura: Number(document.getElementById("altura").value),
            peso: Number(document.getElementById("peso").value),
            idade: Number(document.getElementById("idade").value)
        }
        verbo = 'PUT'
    }
    else { // vai inserir
        paciente = {
            nome: document.getElementById("nome").value,
            cpf: document.getElementById("cpf").value,
            altura: Number(document.getElementById("altura").value),
            peso: Number(document.getElementById("peso").value),
            idade: Number(document.getElementById("idade").value)
        }
        verbo = 'POST'
    }

    if ((!paciente.nome) || (!paciente.cpf) || (!paciente.altura)){
        alert('Campos vazios')
        return
    }

    // vamos criar a conexão
    let requisicao = new XMLHttpRequest()
    // true indica que a abertura de conexão é assíncrona
    requisicao.open(verbo, 'http://localhost:8080/paciente', true)
    
    // configura o cabeçalho da requisição
    requisicao.setRequestHeader("Content-Type", "application/json")
    // converte json em string
    requisicao.send(JSON.stringify(paciente))
    alert('Paciente foi inserido com sucesso')
    preencherTabela()
}

let remover = (id) => {
    // cria um objeto
    let resp = confirm(`Confirma exclusão do paciente`)
    if (resp) {
        let req = new XMLHttpRequest()
        req.open('DELETE', `http://localhost:8080/paciente/${id}`, true)
        req.send()
        alert(`Paciente removido com sucesso`)
        preencherTabela()
    }
}

let preencherTabela = () => {

    // criar conexão para chamada de API
    let req = new XMLHttpRequest()
    req.open('GET', 'http://localhost:8080/paciente', true)
    req.onload = function(){
        // recupera os dados da API - converte string em JSON
        let pacientes = JSON.parse(this.response)
        console.log(pacientes)
        // percorrer os pacientes
        let conteudo = ""
        pacientes.map(paciente => {
            conteudo = conteudo + `<tr> <td> ${paciente.nome}</td> <td> ${paciente.cpf}</td> <td> ${paciente.altura}</td> <td> ${paciente.peso}</td> <td> ${paciente.idade} </td> <td> <button onClick="remover(${paciente.id})"> <i class="bi bi-archive-fill"></i> </button> </td> <td> <button onClick="editar(${paciente.id}, '${paciente.cpf}', '${paciente.nome}', ${paciente.altura}, ${paciente.idade}, ${paciente.peso})"> <i class="bi bi-pencil-fill"></i> </button> </td> </tr>`
        }) 
        document.getElementById("conteudoTabela").innerHTML = conteudo
    }
    req.send()
    // monta a saída de dados
    
}

let editar = (id, cpf, nome, altura, idade, peso) => {
    document.getElementById("cpf").value = cpf
    document.getElementById("nome").value = nome
    document.getElementById("altura").value = altura
    document.getElementById("idade").value = idade
    document.getElementById("peso").value = peso
    // estratégia
    document.getElementById("id").value= id
}

// configurações médicos

// cadastrar médico
function cadastrarMedico(){
    // recupera os dados do médico
    let nome = document.getElementById("nome").value
    let crm = Number(document.getElementById("crm").value)
    let especialidade = document.getElementById("especialidade").value
    let id = document.getElementById("id").value
    let verbo // POST para inserção ou PUT para atualização
    
    // cria o objeto para inserção no BD
    let medico

    if (id){
        verbo = "PUT"
        medico = {
            "nome": nome,
            "crm": crm,
            "especialidade": especialidade,
            "id": id
        }
    }
    else {
        verbo = "POST"
        medico = {
            "nome": nome,
            "crm": crm,
            "especialidade": especialidade
        }
    }
    
    // conecta no servidor de APIs
    let req = new XMLHttpRequest()
    req.open(verbo, `http://localhost:8080/medico`, true) // conexão assíncrona
    req.setRequestHeader("Content-Type", "application/json")
    req.send(JSON.stringify(medico))
    alert(`Médico inserido/atualizado com sucesso`)
    consultaMedicos()
}

function consultaMedicos(){
    let req = new XMLHttpRequest()
    req.open('GET', 'http://localhost:8080/medico', true)
    req.onload = function() {
        let conteudo = ""
        let medicos = JSON.parse(this.response) // transforma resposta em JSON
        medicos.map( medico => {
            conteudo = conteudo + `<tr> <td> ${medico.nome} </td> <td> ${medico.crm} </td> <td> ${medico.especialidade} </td> <td> <i onClick="removeMedico(${medico.id})" class="bi bi-trash"></i> </td> <td> <button onclick="atualizaMedico(${medico.id}, '${medico.nome}', '${medico.crm}', '${medico.especialidade}')"> <i class="bi bi-pencil"></i> </button></td></tr>`
        })
        document.getElementById("conteudoTabela").innerHTML = conteudo
    }
    req.send()
}

function removeMedico(id){
    let resp = confirm(`Deseja realmente excluir médico ${id}? `)
    if (resp) {
        let req = new XMLHttpRequest()
        req.open('DELETE', `http://localhost:8080/medico/${id}`, true)
        req.setRequestHeader('Content-Type', 'application/json')
        req.send()
        alert(`Médico removido com sucesso`)
        consultaMedicos()
    }
}

function atualizaMedico(id, nome, crm, especialidade){
    document.getElementById("nome").value = nome
    document.getElementById("crm").value = crm
    document.getElementById("especialidade").value = especialidade
    document.getElementById("id").value = id
}
