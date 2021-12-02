# CGPA-Calculator (JavaFX Application)

This is a JavaFX based CGPA calculator application. 

<br>

## Features

- Semester term CGPA calculation.
- Total CGPA calculation with previous semester result.
- Different grade policy of diffrenet university. (Only for BD)
- User can create a profile to save the semester wise grade sheet.
- User can use/open any saved profile at any time.


<br>

## Tools Used :

- Java [JDK 17]
- Java 8
- IntelliJ IDEA
- SceneBuilder

<br>

## Library Used :

- [FontAwesomeFX](https://github.com/Jerady/fontawesomefx-glyphsbrowser)
- [JFoenix 9.0.10](http://www.jfoenix.com/)
- ControlFX [v11.1.0](https://jar-download.com/artifacts/org.controlsfx/controlsfx-samples)

<br>

## Setup (JAR) :

- ### _Tools required_ :
  - Java [JDK 8+]


<br>

> Just download the latest jar file from release tag and run it by JVM. 

<br>

## Setup (IDE) :

- ### _Tools required :_
  - Java [JDK 17] or [Latest](https://www.oracle.com/java/technologies/downloads/)
  - IntelliJ IDEA

<br>

- ### _Download :_
  - JavaFX (sdk-17 or [Latest](https://gluonhq.com/products/javafx/))
  - ControlFX (controlsfx-11.1.0 or [Latest](https://jar-download.com/artifacts/org.controlsfx/controlsfx-samples))
  - Library mentioned avobe.

> All Librabry files are available in [**_Library-Repo_**](https://github.com/ashik5757/Library-Repo.git) folder. It's better to download from this repo to run the code properly.

>  [FontAwesomeFX 9](https://github.com/ashik5757/Library-Repo/tree/master/Java/FontAwesomeFX) - Download **SearchBar** and **Zip** file or all the individual file. <br>
>  [ControlFX v11.1.0](https://github.com/ashik5757/Library-Repo/tree/master/Java/ControlFX) - Dowmload controlsfx-11.1.0.jar. <br>
>  [JFoenix 9.0.10](https://github.com/ashik5757/Library-Repo/tree/master/Java/JFoenix) - Dowmload jfoenix-9.0.10.jar

<br>


- ### _Process_ :

  - Open new project in IntelliJ IDEA.
  - Attach lib folder directory of javafx-sdk to Libraries in project structure.
  - Attach **FontAwesome**,**JFoenix**and **ControlFX** jar file in module dependency in project structure.
  - Download the zip file of the code.
  - Now run the **FakeLauncher.java** or **LaunchApp.java**.

If the program does not run and shows an error like following line, then update the VM option in run configuration.

    Error: JavaFX runtime components are missing, and are required to run this application

<br>

Go to the Run -> Edit Configurations... of **FakeLauncher.java** or **LaunchApp.java** and paste the following line in _Add VM option_ from _Modify option_.

~~~
--module-path
"F:\Download\Soft\Java\JavaFx\javafx-sdk-16\lib"
--add-modules
javafx.controls,javafx.fxml
--add-exports
javafx.base/com.sun.javafx.event=ALL-UNNAMED
~~~

> NOTE : Must change the directory path for javafx-sdk-16\lib.

<br>

It is better to add VM option in run config to omit unnecessary error :

    WARNING: Unsupported JavaFX configuration: classes were loaded from 'unnamed module @4b7d8551'


<br>


## Screenshot of Functionalities :

<br>

- ### _Homepage_ :

  - **Semester CGPA :**
  
<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/144481614-4d3b597f-832b-48f3-90cf-38b003559355.png" height="60%" width="60%">
</p>


![image](https://user-images.githubusercontent.com/81816852/144481852-9ff51692-50a7-4126-869a-cc4e9d25bde2.png)
![image](https://user-images.githubusercontent.com/81816852/144481911-1810b302-005b-48fd-acb9-bda0e8c31fe0.png)
![image](https://user-images.githubusercontent.com/81816852/144481976-b91ebe11-ed87-49fe-9473-9c3f7cf48a47.png)
![image](https://user-images.githubusercontent.com/81816852/144482091-065f21cf-dc3f-4938-860c-3488ca140a64.png)
![image](https://user-images.githubusercontent.com/81816852/144482210-ab3deed5-ec2d-4d54-b320-3e3fa0fc2b66.png)
![image](https://user-images.githubusercontent.com/81816852/144482295-1a61b428-0118-4489-99b9-1c66a9891d00.png)
![image](https://user-images.githubusercontent.com/81816852/144482328-fc7cfc73-5ab8-4905-adba-89501c89c91f.png)
![image](https://user-images.githubusercontent.com/81816852/144482662-89d8f8e5-7a49-416b-872a-57e6b875b063.png)
![image](https://user-images.githubusercontent.com/81816852/144483244-5fb1ebd5-c7d7-466c-bb4b-6ec621bd504f.png)
![image](https://user-images.githubusercontent.com/81816852/144483359-a5862092-dbe8-4daf-81b2-bb49bad7f460.png)






