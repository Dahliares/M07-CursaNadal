<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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

                    <h1 style="color: white"> <i class="fa-solid fa-gift"></i> CORREDORS <i class="fa-solid fa-gifts"></i></h1>
                    <p style="color: white"> Llista de corredors a la cursa de Nadal </p>
                </div>
            </div>
        </section>
        <section class="container">
            <div class="row">        
                <c:forEach items="${corredors}" var="corredor">
                    <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                        <div class="thumbnail" style="border-radius: 25px">
                            <div class="caption">
                                <h3>DORSAL: ${corredor.dorsal}</h3>
                                <p>${corredor.nom} ${corredor.cognoms}</p>
                                <p>Categoria: ${corredor.categoria}</p>                                
                                <a href=" <spring:url value= "./corredor?codi=${corredor.codi}" /> ">
                                    <button class="btn-success" style="border-radius: 10%; padding-left: 12px;padding-right: 12px">
                                        <i class="fa-solid fa-info"></i> Detall
                                    </button></a>
                            </div>
                        </div>
                    </div> 
                </c:forEach>
            </div>
        </section>
    </body>
</html> 