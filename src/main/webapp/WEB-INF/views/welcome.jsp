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
                    <button class="btn-success" style="border-radius: 10%; padding-left: 12px;padding-right: 12px">
                        <i class="fa-solid fa-house-chimney"></i> Home
                    </button>
                    <h1 style="color: white"> <i class="fa-solid fa-gift"></i> CURSA DE NADAL 2022 <i class="fa-solid fa-gifts"></i></h1>
                    <p style="color: white"> Sara Ortega Zúñiga </p>
                </div>
            </div>
        </section>
        <section class="container">
            <div class="row">            
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="thumbnail" style="border-radius: 25px">
                        <div class="caption">
                            <h3>INSCRIURE</h3>
                            <p>Permet inscriure un corredor</p>
                            <a href="/cursanadalSO/corredors/add">
                            <button class="btn-success" style="border-radius: 10%; padding-left: 12px;padding-right: 12px">
                                <i class="fa-solid fa-plus"></i> Inscriure
                            </button></a>
                        </div>
                    </div>
                </div>      
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="thumbnail" style="border-radius: 25px">
                        <div class="caption">
                            <h3>META</h3>
                            <p>Permet registrar un corredor quan arriba a meta</p>
                             <a href="/cursanadalSO/corredors/addTemps">
                            <button class="btn-success" style="border-radius: 10%; padding-left: 12px;padding-right: 12px">
                                <i class="fa-solid fa-pencil"></i> Meta
                            </button></a>
                        </div>
                    </div>
                </div>   
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="thumbnail" style="border-radius: 25px">
                        <div class="caption">
                            <h3>CONSULTAR</h3>
                            <p>Permet consultar corredor per dorsal</p>
                            <a href="/cursanadalSO/corredors/qryDorsal">
                            <button class="btn-success" style="border-radius: 10%; padding-left: 12px;padding-right: 12px">
                                <i class="fa-solid fa-info"></i> Dorsal
                            </button></a>
                        </div>
                    </div>
                </div> 


            </div>
            <div class="row">            
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px" >
                    <div class="thumbnail" style="border-radius: 25px">
                        <div class="caption">
                            <h3>LLISTAT INSCRITS</h3>
                            <p>Permet llistar tota la inscripció</p>
                            <a href="/cursanadalSO/corredors/all">
                                <button class="btn-success" style="border-radius: 10%; padding-left: 12px;padding-right: 12px">
                                <i class="fa-solid fa-list"></i> Llistar
                                </button></a>
                        </div>
                    </div>
                </div>      
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="thumbnail" style="border-radius: 25px">
                        <div class="caption">
                            <h3>LLISTAT META</h3>
                            <p>Llistat de meta, ordenada per categoria i temps</p>
                            <a href="/cursanadalSO/corredors/meta">
                            <button class="btn-success" style="border-radius: 10%; padding-left: 12px;padding-right: 12px">
                                <i class="fa-solid fa-list"></i> Meta
                            </button></a>
                        </div>
                    </div>
                </div>   
            </div>

        </section>
    </body>
</html> 