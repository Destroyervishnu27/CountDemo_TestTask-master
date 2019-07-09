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

 # Imporant Topic for project:-
 1. <a href="https://developer.android.com/studio/projects/create-project">How start New Project in Android Studio</a>

 2. <a href="https://developer.android.com/reference/android/widget/Button">Button</a>

 3. <a href="https://developer.android.com/reference/android/view/View.OnClickListener">View.OnClickListener</a>

 4. <a href="https://developer.android.com/training/data-storage/shared-preferences">Save key-value data</a>
