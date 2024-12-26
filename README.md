This is a Kotlin Multiplatform project targeting Android, iOS, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

<img width="389" alt="image" src="https://github.com/user-attachments/assets/08feef8d-08a6-418d-bd36-f483e122869d" />
<img width="390" alt="image" src="https://github.com/user-attachments/assets/b85bd9e9-264a-432f-bde1-bb0aa3b83345" />
<img width="392" alt="image" src="https://github.com/user-attachments/assets/ac694331-1da6-4352-8889-b55379e640bb" />
<img width="384" alt="image" src="https://github.com/user-attachments/assets/c17aed18-f1cc-4047-b7bb-7cec574b8d57" />
<img width="393" alt="image" src="https://github.com/user-attachments/assets/49b0bd0b-99a3-4ca1-8a92-791161bcca3b" />
