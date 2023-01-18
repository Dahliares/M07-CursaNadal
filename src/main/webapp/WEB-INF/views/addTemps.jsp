<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ca">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" 
              integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" 
              crossorigin="anonymous" referrerpolicy="no-referrer" />
    </head>
    <body style="background: #ffccff"  >
        <section>
            <div class="jumbotron" style="background: darkred; border-bottom: solid green; border-bottom-width: 10px">
                <div class="container" >
                      <a href="/cursanadalSO">
                          <button class="btn-success" style="border-radius: 10%; padding-left: 12px;padding-right: 12px">
                        <i class="fa-solid fa-house-chimney"></i> Home
                          </button></a>
                          
                    <h1 style="color: white"> <i class="fa-solid fa-gift"></i> AFEGIR TEMPS A META <i class="fa-solid fa-gifts"></i></h1>
                    <p style="color: white"> Afegir temps de meta de un corredor </p>
                </div>
            </div>
        </section>
        <section class="container">
            <div class="row">        
                 <fieldset>
                    <legend>Registrar temps</legend>
                    <form method="post" modelAtributte="tempsForm" class="form-horizontal" > 
                        <div class="form-group">
                            <label class="control-label col-sm-2"  for="dorsal">Dorsal: </label>
                            <input type="text" path="dorsal" id="dorsal" name="dorsal" required>
                           
                        </div>
                        <div class="form-group">
                        <label class="control-label col-sm-2" for="temps">Temps (HHMMSS): </label>
                            <input type="text" path="temps" id="temps" name="temps" required pattern=([0-1]?\d|2[0-3]):([0-5]?\d):([0-5]?\d)>
                         </div>
                            <div class="form-group">        
                            <div class="col-sm-offset-2 col-sm-10">
                               
                                   <button class="btn btn-success" >Cercar</button>
                               
                            </div>
                        </div>

                    </form>
                </fieldset>
              
        </section>
    </body>
</html