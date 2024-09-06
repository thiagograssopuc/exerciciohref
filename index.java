<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        function validarFormulario() {
            var email = document.getElementById("email").value;
            var senha = document.getElementById("senha").value;
            if (email === "" || senha === "") {
                alert("Por favor, preencha todos os campos.");
                return false;
            } else {
                window.location.href = 'entrar.html';
                return true;
            }
        }
    </script>
</head>
<body>
    <div>
        <h2> Bem-vindo(a)!</h2>
    </div>
    <div>
        <label>E-mail:</label> <input type="email" id="email" placeholder="E-mail"> <br>
        <label>Senha: </label> <input type="password" id="senha" placeholder="Senha"> <br>
        <button onclick="return validarFormulario()">Entrar</button>
    </div>
    <div>
        <h3>Não possui conta?</h3>
        <h3><a href="cadastrar.html">Cadastre-se!</a></h3>
    </div>
</body>
</html>

    
