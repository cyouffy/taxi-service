<h1 align="center">Taxi Service</h1>

[comment]: <> (https://i.imgur.com/puXHgCT.jpg)
<img src="https://i.imgur.com/Ao4FIVg.png" width="100%">

<h2>Description</h2>
Taxi service is designed for companies that provide services
for passengers and cargo. With it, you can track the available
cars in the taxi fleet, assign existing drivers, as well as add
new drivers and new cars.

<h2>Features</h2>
<ul>
<li>Display all drivers and cars</li>
<li>Register new driver, car, or manufacturer</li>
<li>Assign a driver for a vacant car</li>
<li>Divide a driver from a car</li>
</ul>

<h2>Tech Stack</h2>
<ul>
<li>Apache Tomcat</li>
<li>Maven</li>
<li>MySql</li>
<li>JDBC</li>
<li>Servlet</li>
<li>JSTL</li>
<li>JSP, HTML</li>
<li>Maven Checkstyle Plugin</li>
</ul>

<h2>Requirements</h2>
<ul>
<li>JDK 11</li>
<li>Tomcat</li>
<li>MySQL Workbench</li>
<li>IDE (IntelliJ IDEA, Eclipse, etc.)</li>
</ul>

<h2>Project setup</h2>
<ol>
    <li>Clone this project into your local directory and open the project in an IDE.</li>
    <li>To configure MySQL DBMS use the script from <a href="https://github.com/cyouffy/taxi-service/blob/added-project/src/main/resources/init_db.sql">resources/init_db.sql</a>.</li>
    <li>Specify the URL to the database, as well as the password and username in the project directory <a href="https://github.com/cyouffy/taxi-service/blob/added-project/src/main/java/taxi/util/ConnectionUtil.java">taxi/util/ConnectionUtil.java</a>.</li>
    <li>Configure Apache Tomcat.</li>
    <li>Now you can run the project.</li>
</ol>
