<html>
<head>
    <meta charset="utf-8">
    <title>My Portfolio</title>
]
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900|Cormorant+Garamond:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="../vendors/bootstrap3.3.7/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="../vendors/fontawesome/css/all.css"/>
    <link rel="stylesheet" type="text/css" href="../vendors/nivoslider/themes/default/default.css"/>
    <link rel="stylesheet" type="text/css" href="../vendors/nivoslider/nivo-slider.css"/>
    <link rel="stylesheet" href="style1.css">
</head>
<body>
<header>
    <a href="index.html" class="header-brand">GALLERY</a>
    <nav>
        <ul>
            <li><a href="portfolio.html">Portfolio</a></li>
            <li><a href="about.html">About me</a></li>
            <li><a href="contact.html">Contact</a></li>
        </ul>
        <a href="cases.html" class="header-cases">Cases</a>
    </nav>
</header>
<main>
    <section class="cases-links">
        <div class="wrapper">
            <h2>Gallely</h2>
            <div class="box">
                <?php
                require_once 'login.php';
                $conn = new mysqli($hn, $un, $pw, $db);
                if ($conn->connect_errno) die("kết nối thất bại");

                $query = "SELECT * FROM images";
                $result = $conn->query($query);
                if (!$result) die("kết nội thất bại2");

                $rows = $result->num_rows;
                for ($j=0 ; $j < $rows ; ++$j) {
                    $row = $result->fetch_array(MYSQLI_ASSOC);
                    echo "<div class='bar' style='float: left;margin-left: 15px'>";
                    echo "<img src='../img/$row[name]' width='300px' height='300px'>";
                    echo "<br>";
                    echo "<br>";
                    echo "<h2>$row[title1]</h2>";
                    echo "<p>$row[title2]</p>";
                    echo "<br>";
                    echo "</div>";
                }
                $result->close();
                $conn->close();
                ?>
            </div>
        </div>
    </section>

</main>
<div class="wrapper">
    <footer>
        <ul class="footer-links-main">
            <li><a href="#">Home</a></li>
            <li><a href="#">Cases</a></li>
            <li><a href="#">Portfolio</a></li>
            <li><a href="#">About me</a></li>
            <li><a href="#">Contact</a></li>
        </ul>
        <ul class="footer-links-cases">
            <li><p>Latest cases</p></li>
            <li><a href="#">MALING SHAOLIN - WEB DEVELOPMENT</a></li>
            <li><a href="#">EXCELLENTO - WEB DEVELOPMENT, SEO</a></li>
            <li><a href="#">MMTUTS - YOUTUBE CHANNEL</a></li>
            <li><a href="#">WELTEC - VIDEO PRODUCTION</a></li>
        </ul>
        <div class="footer-sm">
            <a href="#">
                <i class="fab fa-youtube"></i>
            </a>
            <a href="#">
                <i class="fab fa-twitter-square"></i>
            </a>
            <a href="#">
                <i class="fab fa-facebook"></i>
            </a>
        </div>
    </footer>
</div>
</body>

</html>
