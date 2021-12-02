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
    
</p>

![img.png](img.png)






