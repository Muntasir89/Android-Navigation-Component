# Android-Navigation-Component
Navigation refers to the interactions that allow users to navigate across, into, and back out from the different pieces of content within your app. Android Jetpack's Navigation component helps you implement navigation, from simple button clicks to more complex patterns, such as app bars and the navigation drawer.

### Advantages of view binding-- </br>
- It supports null safety. This feature prevents developers from calling non-existent views or ids. As a result, it prevents the app from sudden crashes.</br>
- Helps to reduce boilerplate code.</br>
- Facilitates type safety. The binding class that is generated matches the views declared in the layout file. Once again, this feature prevents an application from crashing.</br>
</br></br>
### setup instruction<br>
Add these lines to **_build.gradle(app)_** file
```
buildFeatures{
    viewBinding = true
}
```
### Fragment code with ViewBinding
![ViewBindingKotlin](https://user-images.githubusercontent.com/78687005/200107058-ce44d839-0850-487f-ac62-eb6c632d988c.JPG)

# Output
## FirstFragment
Initial and after clicking the textView2</br>
![resize-1667587099749787663Screenshot202211050003040738b76c94a9991a59ecfa8ddd051eb9271](https://user-images.githubusercontent.com/78687005/200050802-d840650a-ab40-4d6e-8bf2-f66581c5127a.jpg)

## SecondFragment
After clicking the textView1</br>
![resize-16675869961931251272Screenshot202211050003100938b76c94a9991a59ecfa8ddd051eb9271](https://user-images.githubusercontent.com/78687005/200050536-ccb4ab25-6c30-4116-a9c9-4ff6997301f5.jpg)
