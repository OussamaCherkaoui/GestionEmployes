<%@ include file="taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="./style.css">
<style>
<%@ include file="style.css" %>
</style>

</head>
<body>
   <%@ include file="navBar.jsp" %>
   <h2>Liste des employ�s</h2>
    <table>
        <thead>
            <tr>
                <th>Nom</th>
                <th>Email</th>
                <th>T�l�phone</th>
                <th>D�partement</th>
                <th>Poste</th>
                <th>Apport� depuis</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="employe" items="${listeEmployes}">
                <tr>
                    <td>${employe.nom}</td>
                    <td>${employe.email}</td>
                    <td>${employe.telephone}</td>
                    <td>${employe.departement}</td>
                    <td>${employe.poste}</td>
                    <td><form method="post" action="showEmployee"><input type="submit" value="Modifier" name="${ employe.nom }"><input type="submit" value="Supprimer" name="${ employe.nom }"></form></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>