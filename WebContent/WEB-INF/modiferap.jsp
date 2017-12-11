<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!doctype html>
<html >
<head>

    <meta charset="utf-8">
    <link rel="shortcut icon" type="image/x-icon" href="image/etudiant.png" />
      <title>Ma PFE</title>

    <link rel="stylesheet" href="res/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="res/css/style.css">


</head>
<body>
<div class="container-full">
    <div class="well well-lg">
        <div id="div-infoUser">
            <img src="image/9.jpg" class="img-profil">
            <p id="nom-user">ahmid hizawi </p>

        </div>
        <div class="btn-group" id="btn-profil">
            <button class="btn btn-default btn-sm dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="caret" id="d"></span>Profile <span class="glyphicon glyphicon-user"></span>
            </button>
            <ul class="dropdown-menu">
                <li><a href="profile.php">Modifier Profile<span class="glyphicon glyphicon-cog icons" ></span></a> </li>
                <li> <a href="deconnexion.php">Ddéconnecter<span class="glyphicon glyphicon-off icons"></span> </a></li>
            </ul>
        </div>

    </div>
    <div class="row">
        <div class="col-lg-2" id="navbar-inverse">
            <div id="container-logo">
                <h2 id="nom_site">Ma PFE</h2>
                <img src="../image/logo.png" alt="logo">
                <p id="titre-logo">rapports</p>
            </div>
            <nav class="navbar navbar-inverse">
              <ul class="nav navbar-left" id="ul-nav">
                  <li class="active" > <a href="home">accueil  </a> </li>
                    <li class="active" id="a"> <a href="#">Licence Appliquée <span class="caret"></span> </a> </li>
                  <div class="div-nav-page" id="aa"  hidden><br>
                      <a href="home.php?br=T.L.A TMW" class="lien-page pos-lient">-Rappots T.L.A TMW </a>
                  </div>
                  <li> <a href="#" id="i">Licence Fondamentale<span class="caret"></span></a> </li>
                  <div class="div-nav-page" id="ii" hidden><br>

                      <a href="home.php?br=T.L.A FIM" class="lien-page pos-lient">Rappots T.L.A FIM </a>
                  </div>
                  <li> <a href="#" id="f">Master<span class="caret"></span></a> </li>
                  <div class="div-nav-page" id="ff" hidden><br>
                      <a href="home.php?br=P.MSI" class="lien-page pos-lient">Rappots P.MSI</a><br>
                      <a href="home.php?br=D.MSI" class="lien-page pos-lient">Rappots D.MSI </a>
                  </div>
                  <li> <a href="#" id="o">Ingénierie<span class="caret"></span></a> </li>
                  <div class="div-nav-page" id="oo" hidden><br>

                      <a href="home.php?br=T.G TMW" class="lien-page pos-lient">Rappots T.G TMW </a>
                  </div>

                  <li><a href="parametre.php"    >Paramétres</a> </li>
              </ul>
            </nav>


        </div>
        <!-- cure de app-->

        <div class="col-lg-7" id="container-rapport" style="height: 612px; width: 932px; left: 379px;"">
        <h2 id="h2"> modifier rapport</h2>
        <!-- recherche-->
        <div class="container">

        <div class="div-recherch">
            <div class="col-md-3">
                <div id="custom-search-input">
                    <form method="post" action="recherch.php" name="form">
                        <div class="input-group col-md-10">
                            <input type="text" class="form-control input-ms" placeholder="Recherch ..." name="rech" />
                            <span class="input-group-btn">
                                <button class="btn btn-info btn-ms" type="submit" >
                                    <i class="glyphicon glyphicon-search"></i>
                                </button>
                            </span>
                        </div>
                    </form>
                </div>
            </div>
        </div>



            <!--contener ajout rapoort-->

            <div class="container" style="position: relative;left: 461px;bottom: -40px;">

                <!-- Trigger the modal with a button -->
    
                <!-- Modal -->
    <div class="" id="myModal"  style="
    position: relative;
    left: -656px;
">
        <div class="modal-dialog">
            <!-- Modal content-->
            <div class="modal-content row" >
                <div class="modal-header"> modifier un rapport  </div>
                    <div class="modal-body col-lg-7" >
                        <!-- formuler-->

    <form name="formuler" class="form" method="post" action="" >
         <div  class="form-group-sm">
            <input type="text" placeholder="Nom Etudiant" name="nom" class="form-control"  required id="nom" value="ss"><br>

            <input type="text" placeholder="Prenom Etudiant" name="prnom" class="form-control" required id="prnom" value="ss"><br>

            <input type="text" placeholder="Titre De Rapport" name="titre" class="form-control" required id="titre" value="ss"><br>

            <select class="form-control" required name="branche">
                <option ></option>
                <option name="branche" >T.L.A TMW</option>
                <option name="branche">T.L.A FIM</option>
                <option name="branche">P.MSI</option>
                <option name="branche">D.MSI</option>
                <option name="branche">T.G TMW</option>
            </select> <br>

            <input type="text" placeholder="Montion De Rapport" name="montion" class="form-control" required  id="montion" value="ss"><br>
            <input type="text" placeholder="année scolaire " name="annee" class="form-control" required id="annee" value="ss"><br>
            <textarea  name="desc" class="form-control" required id="des"  placeholder=" ss "></textarea><br>

            <label class="custom-file">Ficher PDF:
                <input type="file" class="custom-file-input" name="file" id="file" required>
                    <span class="custom-file-control"></span>
            </label><br><br>

                <input type="submit" class=" form-control btn-success" style="width: 127px" id="modife" name="modife">
                <input type="reset" class=" form-control btn-danger" style="width: 127px;position: relative;left: 150px;top: -30px;">

                         </div>
                     </form>
                </div>
            </div>
        </div>
    </div>
  </div>
            <br><br>
            <!--fin-->

    </div>

</div>







    <script src="res/js/jquery.js"></script>
    <script src="res/bootstrap/js/bootstrap.js"></script>
    <script src="res/js/ex1.js" ></script>

    <script>



    </script>

</body>
</html>
