<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
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

                    <h1 style="color: white"> <i class="fa-solid fa-gift"></i> CORREDOR <i class="fa-solid fa-gifts"></i></h1>
                    <p style="color: white"> Afegir corredor </p>
                </div>
            </div>
        </section>
        <section class="container">
            <div class="row">        
                <fieldset>
                    <legend>Afegir corredor</legend>
                    <form:form modelAttribute="newCorredor" class="form-horizontal" >
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="codi">Codi:</label>
                            <form:input type="text" path="codi" id="codi" name="codi" required="true"/>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="dorsal">Dorsal:</label>
                            <form:input type="text" path="dorsal" id="dorsal" name="dorsal" required="true"/>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="nom">Nom:</label>
                            <form:input type="text" path="nom" id="nom" name="nom" required="true"/>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="cognoms">Cognoms:</label>
                            <form:input type="text" path="cognoms" id="cognoms" name="cognoms" required="true"/>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="categoria">Categoria:</label>
                            <form:select path="categoria" id="categoria" name="categoria" required="true">
                                <form:option value="junior">Junior</form:option>
                                <form:option value="federats">Federats</form:option>
                                <form:option value="senior">Senior</form:option>
                            </form:select>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="edat">Edat:</label>
                            <form:input type="number" path="edat" id="edat" name="edat" required="true" min="1" max="100"/>
                        </div>
                        <div class="form-group">        
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-success">Afegir</button>
                            </div>
                        </div>

                    </form:form>
                </fieldset>

        </section>
    </body>
</html