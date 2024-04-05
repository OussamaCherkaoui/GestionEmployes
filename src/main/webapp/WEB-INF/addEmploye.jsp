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
   <h2>Ajouter un nouvel employe</h2>
    <form method="post" action="addEmploye">
        <label for="nom">Nom:</label>
        <input type="text" id="nom" name="nom" required><br>
        <label for="email">E-mail:</label>
        <input type="email" id="email" name="email" required><br>
        <label for="tel">Téléphone:</label>
        <input type="text" id="tel" name="tel" required><br>
        <label for="departement">Département:</label>
        <input type="text" id="departement" name="departement" required><br>
        <label for="poste">Poste:</label>
        <input type="text" id="poste" name="poste" required><br>
        <input type="submit" value="Ajouter" id="ajouter">
    </form>
</body>
</html>