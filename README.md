# CountDemo_TestTask
This project is a demo project use to show the count when user touch on screen. this project use simple code . we just get on click listener event and save increase count in to shared preferences. after that show that count into text view .

# Android SDK
Place your<a href="https://developer.android.com/studio?pkg=tools">Android SDK</a>  somewhere in your home directory or some other application-independent location. Some distributions of IDEs include the SDK when installed, and may place it under the same directory as the IDE. This can be bad when you need to upgrade (or reinstall) the IDE, as you may lose your SDK installation, forcing a long and tedious redownload.

Also avoid putting the SDK in a system-level directory that might need root permissions, to avoid permissions issues.

# Build system
Your default option should be <a href="https://gradle.org/">Gradle</a> using the <a href="https://developer.android.com/studio/build/index.html">Android Gradle plugin.</a>

It is important that your application's build process is defined by your Gradle files, rather than being reliant on IDE specific configurations.
 This allows for consistent builds between tools and better support for continuous integration systems.

# Project structure
Although Gradle offers a large degree of flexibility in your project structure, unless you have a compelling reason to do otherwise,
 you should accept its <a href="https://developer.android.com/studio/build/index.html#sourcesets">default structure</a> as this simplify your build scripts.

# Gradle configuration
General structure. Follow <a href="https://developer.android.com/studio/build/index.html">Google's guide on Gradle</a> for Android.



# minSdkVersion: 14
 We recommend to have a look at the <a href="https://developer.android.com/about/dashboards/index.html#Platform">Android version usage chart</a> before defining the minimum API required.
 Remember that the statistics given are global statistics and may differ when targeting a specific regional/demographic market.
 It is worth mentioning that some material design features are only available on Android 4.0.1 - 4.0.2 (API level 14) and above.
 And also, from API 14, the multidex support library is not needed anymore.

 # Unit tests that mocks the Android framework

 This project uses the Gradle build system and the Android gradle plugin support for unit testing. You can either benefit from IDEs integration such as Android studio or run the tests on the command line.

 Unit tests run on a local JVM on your development machine. The Android Gradle plugin will compile your app's source code and execute it using gradle test task. Tests are executed against a modified version of android.jar where all final modifiers have been stripped off. This lets you use popular mocking libraries, like Mockito.

 For more information see <a href=" http://tools.android.com/tech-docs/unit-testing-support">http://tools.android.com/tech-docs/unit-testing-support</a>


 # Install the dependencies

testImplementation 'junit:junit:4.12'

testImplementation 'org.mockito:mockito-core:1.10.19'

 # Junit:
 It is a “Unit Testing” framework for Java Applications. It is an automation framework for Unit as well as UI Testing. It contains annotations such as @Test, @Before, @After etc.

 # Mockito:
 Mockito mocks (or fakes) the dependencies required by the class being tested. It provides annotations such as @Mock.


 # Use Gradle on the command line.

 After downloading the projects code using git clone you'll be able to run the unit tests using the command line:

 ./gradlew test

 If all the unit tests have been successful you will get a BUILD SUCCESSFUL message.

 # Imporant Topic for project:-
1.  <a href="https://developer.android.com/studio/projects/create-project">How start New Project in Android Studio</a>

2.  <a href="https://developer.android.com/reference/android/widget/Button">Button</a>

3.  <a href="https://developer.android.com/reference/android/view/View.OnClickListener">View.OnClickListener</a>

4.  <a href="https://developer.android.com/training/data-storage/shared-preferences">Save key-value data</a>


 # How Project Work:-
 1. Use on click Listener to get Click event oh application screen.
 2. Use Shared preferences to store the value.
 3. Get last click count from preferences and and increase that count . store again that value in to shared preferences.


