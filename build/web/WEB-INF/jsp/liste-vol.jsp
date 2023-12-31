<%-- Document : test Created on : May 24, 2022, 12:56:45 PM Author : jaheem --%>
<%@page import="mg.agence.voyage.model.EtatVol"%>
<%@page import="mg.agence.voyage.model.DetailsVol"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.List" %>
<% 
    List<EtatVol> vols = (List<EtatVol>) request.getAttribute("vols");
%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Agence Voyage</title>
        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Favicons -->
        <link href="ressources/assets/img/favicon.png" rel="icon">
        <link href="ressources/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.gstatic.com" rel="preconnect">
        <link
            href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
            rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="ressources/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="ressources/assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="ressources/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="ressources/assets/vendor/quill/quill.snow.css" rel="stylesheet">
        <link href="ressources/assets/vendor/quill/quill.bubble.css" rel="stylesheet">
        <link href="ressources/assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="ressources/assets/vendor/simple-datatables/style.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="ressources/assets/css/style.css" rel="stylesheet">

        <!-- =======================================================
* Template Name: NiceAdmin - v2.2.2
* Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
* Author: BootstrapMade.com
* License: https://bootstrapmade.com/license/
======================================================== -->
    </head>

    <body>

        <!-- ======= Header ======= -->
        <header id="header" class="header fixed-top d-flex align-items-center">

            <div class="d-flex align-items-center justify-content-between">
                <a href="/" class="logo d-flex align-items-center">
                    <img src="assets/img/logo.png" alt="">
                    <span class="d-none d-lg-block">GestionImmobilisation</span>
                </a>
                <i class="bi bi-list toggle-sidebar-btn"></i>
            </div>
            <!-- End Logo -->
        </header>
        <!-- End Header -->

        <!-- ======= Sidebar ======= -->
        <aside id="sidebar" class="sidebar">

            <ul class="sidebar-nav" id="sidebar-nav">

                <li class="nav-item">
                    <a class="nav-link collapsed" href="home">
                        <i class="bi bi-grid"></i>
                        <span>Accueil</span>
                    </a>
                </li>
                <!-- End Dashboard Nav -->

                <li class="nav-heading">Pages</li>

                <li class="nav-item">
                    <a class="nav-link collapsed" href="searchVol">
                        <i class="bi bi-question-circle"></i>
                        <span>Recherche Vol</span>
                    </a>
                </li>
                <!-- End F.A.Q Page Nav -->

                <li class="nav-item">
                    <a class="nav-link collapsed" href="newvol">
                        <i class="bi bi-envelope"></i>
                        <span>Ajout Vol</span>
                    </a>
                </li>
                
                <li class="nav-item">
                    <a class="nav-link collapsed" href="listevol">
                        <i class="bi bi-envelope"></i>
                        <span>Liste Vol</span>
                    </a>
                </li>
                <!-- End Contact Page Nav -->
                <!-- End Register Page Nav -->
            </ul>

        </aside>
        <!-- End Sidebar-->

        <main id="main" class="main">

            <div class="pagetitle">
                <h1>Liste Vol</h1>
                <nav>
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="/">Acceuil</a></li>
                        <li class="breadcrumb-item">Liste Vol</li>
                    </ol>
                </nav>
            </div>
            <!-- End Page Title -->

            <section class="section">
                <div class="row">
                    <div class="col-lg-12">

                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">Liste Vol </h5>
                                <!-- <p>Add lightweight datatables to your project with using the <a href="https://github.com/fiduswriter/Simple-DataTables" target="_blank">Simple DataTables</a> library. Just add <code>.datatable</code> class name to any table you wish to conver to a datatable</p> -->
                                
                                <!-- Table with stripped rows -->
                                <table class="table" id="mytable">
                                    <thead>
                                        <tr>
                                            <th scope="col">Vol</th>
                                            <th scope="col">Avion</th>
                                            <th scope="col">Lieu de départ</th>
                                            <th scope="col">Lieu d'arrivée</th>
                                            <th scope="col">Date de départ</th>
                                            <th scope="col">Heure de départ</th>
                                            <th scope="col">Durée</th>
                                            <th scope="col">Nombre Place réservé</th>
                                            <th scope="col">Nombre Place Disponible</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%for (EtatVol vol : vols) {%>
                                        <tr>
                                            <td>
                                                Vol <%= vol.getId() %>
                                            </td>
                                            <td>
                                                <%= vol.getModele() %>
                                            </td>
                                            <td>
                                                <%= vol.getLieuDepart() %>
                                            <td>
                                                <%= vol.getLieuArrivee() %>
                                            </td>
                                            <td>
                                                <%= vol.getDateDepart() %>
                                            </td>
                                            <td>
                                                <%= vol.getHeureDepart() %>
                                            </td>
                                            <td>
                                                <%= vol.getDuree() %>
                                                heures
                                            </td>
                                            <td>
                                                <%= vol.getTotalPlaceReserver()%>
                                            </td>
                                            <td>
                                                <%= vol.getNombrePlaceDisponible()%>
                                            </td>
                                        </tr>
                                        <% } %>
                                    </tbody>
                                </table>
                                <!-- End Table with stripped rows -->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </main>
        <!-- End #main -->

        <footer id="footer" class="footer">
            <div class="copyright">
                &copy; Copyright &copy; 2023 <strong><span>Agence Voyage</span></strong>.
                Tous droits réservés
            </div>
        </footer>
        <!-- End Footer -->

        <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i
                class="bi bi-arrow-up-short"></i></a>

        <!-- Vendor JS Files -->
        <script src="ressources/assets/js/jquery.min.js"></script>
        <script src="ressources/assets/js/pdf.js"></script>
        <script src="ressources/assets/js/jspdf.min.js"></script>
        <script src="ressources/assets/vendor/apexcharts/apexcharts.min.js"></script>
        <script src="ressources/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="ressources/assets/vendor/chart.js/chart.min.js"></script>
        <script src="ressources/assets/vendor/echarts/echarts.min.js"></script>
        <script src="ressources/assets/vendor/quill/quill.min.js"></script>
        <script src="ressources/assets/vendor/simple-datatables/simple-datatables.js"></script>
        <script src="ressources/assets/vendor/tinymce/tinymce.min.js"></script>
        <script src="ressources/assets/vendor/php-email-form/validate.js"></script>

        <!-- Template Main JS File -->
        <script src="ressources/assets/js/main.js"></script>
    </body>

</html>