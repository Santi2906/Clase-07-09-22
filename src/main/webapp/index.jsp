<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
              rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" 
              crossorigin="anonymous">
        <title>Santiago Chavarro</title>
    </head>
    <body>
        <div class="container-fluid">
            <h1 class="text-center">Bienvenido a mi pagina web con Java, GIT y Heroku</h1>
            <div class="abs-center">
                <form action="control" method="GET" class="border p-3 form">
                    <div class="row g-3 align-items-center">
                        <div class="mb-2 col-5 form-floating">
                            <input type="text" name="txt_nombres" required="true" class="form-control" id="nombre" placeholder="Su nombre">
                            <label for="nombre">Nombres: </label>
                        </div>
                        <div class="mb-2 col-5 form-floating">          
                            <input type="text" name="txt_apellidos" required="true" class="form-control" id="apellido" placeholder="apellido">
                            <label for="apellido">Apellidos: </label> 
                        </div>
                        <div class="mb-3 col-5 form-floating">
                            <input type="number" name="telefono" required="true" class="form-control" autocomplete="off" id="tele" placeholder="tele">
                            <label for="tele">Telefono: </label>
                        </div>
                        <div class="mb-3 col-5 form-floating">
                            <input type="email" name="txt_correo" required="true" class="form-control" autocomplete="off" id="cor" placeholder="correo">
                            <label for="cor">Correo: </label>
                        </div>
                    </div>
                    <button type="submit" name="btnRegistrar"  
                            class="btn btn-outline-primary" >Registrar</button>
                    <button type="reset" class="btn btn-outline-danger">Limpiar</button>
                </form>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" 
                integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" 
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" 
                integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" 
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" 
                integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" 
        crossorigin="anonymous"></script>
    </body>
</html>
