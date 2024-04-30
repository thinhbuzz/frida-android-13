frida -Uf com.example.fridaandroid13 -l script.js --runtime=v8
# adb push frida-inject-16.2.1-android-arm64 /data/local/tmp/frida-inject-16.2.1
# adb push script.js /data/local/tmp/frida-android-13-script.js
# am start -S -W com.example.fridaandroid13/com.example.fridaandroid13.MainActivity && /data/local/tmp/frida-inject-16.2.1 -p $(pidof com.example.fridaandroid13) -s /data/local/tmp/frida-android-13-script.js -R v8