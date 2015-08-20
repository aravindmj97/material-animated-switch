Material Animated Switch  
-----------------
[![Download](https://api.bintray.com/packages/kmenager/maven/material-animated-switch/images/download.svg) ](https://bintray.com/kmenager/maven/material-animated-switch/_latestVersion)

A material Switch with icon animations and color transitions



![Demo Screenshot][1]

![Demo Screenshot][2]


### Sample video:

[Youtube Material Animated Switch video](https://youtu.be/MBJpCfXuVuU)

### Sample app:

<a href="https://play.google.com/store/apps/details?id=com.github.glomadrian.materialanimatedswitch.sample">
  <img alt="Get it on Google Play"
       src="https://developer.android.com/images/brand/en_generic_rgb_wo_60.png" />
</a>

Based on
----------

[Inbox Pinned](https://dribbble.com/shots/2098916-Inbox-Pinned) by [Derek Torsani](https://dribbble.com/dmtors)


How to use
----------

By default show the inbox pinned switch

```xml
<com.github.kmenager.materialanimatedswitch.MaterialAnimatedSwitch
     android:id="@+id/pin"
     android:layout_width="wrap_content"
     android:layout_height="wrap_content"
     />
```


With custom colors and icons attributes
```xml
<com.github.kmenager.materialanimatedswitch.MaterialAnimatedSwitch
     android:id="@+id/pin"
     android:layout_width="wrap_content"
     android:layout_height="wrap_content"  
     app:base_release_color="@color/md_deep_orange_900"
     app:base_press_color="@color/md_deep_orange_50"
     app:ball_release_color="@color/md_deep_orange_500"
     app:ball_press_color="@color/md_white_1000"
     app:icon_release="@drawable/ic_play_arrow_white_36dp"
     app:icon_press="@drawable/ic_stop_deep_orange_500_36dp"
     app:ball_radius="15dp"
     app:switch_width="65dp"
     app:switch_height="35dp"
     app:margin="17dp"
     app:icon_size="25dp"
     />
```

Remember put this for custom attribute usage

```java

xmlns:app="http://schemas.android.com/apk/res-auto"

```


For Gradle
---------------------

Grab via Gradle:
```groovy
repositories {
  maven {
    url "http://dl.bintray.com/kmenager/maven"
  }
}
dependencies {
  compile 'com.github.kmenager:material-animated-switch:1.2.2'
}
```

or Maven:
```xml
<dependency>
  <groupId>com.github.kmenager</groupId>
  <artifactId>material-animated-switch</artifactId>
  <version>1.2.2</version>
</dependency>
```
Changelog
---------------------
V 1.2.2

* Set min SDK version to 14
* Change the default inbox icon with different dpi

V 1.2.1

* Remove application name in library
* Fixed pressed state icon moves when keyboard opens or closes

V 1.2

* Fixed bug that called listener twice when switch checked
* Add new options in xml files

V 1.1

* Fixed bug that cut the ball at the start
* Added isChecked() method
* fix toggle() method

Developed By
------------
Kevin Ménager - <kevmenager@gmail.com>

Based on Adrián García Lomas [Material Animated Switch](https://github.com/glomadrian/material-animated-switch)

License
-------

    Copyright 2015 Kevin Ménager

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[1]: ./art/swtich.gif
[2]: ./art/all.png
