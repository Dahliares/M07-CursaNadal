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

                    <h1 style="color: white"> <i class="fa-solid fa-gift"></i> META <i class="fa-solid fa-gifts"></i></h1>

                </div>
            </div>
        </section>
        <section class="container">


            <c:forEach items="${listaGlobal}" var="lista">
                <div class="row">  

                    <ul class="list-group" >

                        <c:forEach items="${lista}" var="corredor" varStatus="myIndex">

                            <c:if test="${myIndex.index == 0}">
                                <h3>Categoria ${corredor.categoria}</h3>
                                <li class="list-group-item active">
                                    ${myIndex.count}. 
                                    ${corredor.nom} ${corredor.cognoms} 
                                    (${corredor.dorsal}) 
                                    Temps: ${corredor.tempsHHMISS}h.
                                </li>

                            </c:if> 
                            <c:if test="${myIndex.index != 0}">
                                <li class="list-group-item ">
                                    ${myIndex.count}. 
                                    ${corredor.nom} ${corredor.cognoms} 
                                    (${corredor.dorsal}) 
                                    Temps: ${corredor.tempsHHMISS}h.
                                </li>
                            </c:if> 
                        </c:forEach> 

                    </ul>
                </div>
            </c:forEach>    
        </section>
    </body>
</html> 