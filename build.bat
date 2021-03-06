@echo off

if not exist libui\build\out\libui.a (
  set "PATH=C:\msys64\mingw64\bin;%PATH%"
  git submodule update --init
  md libui\build
  cd libui\build
  cmake -G "MinGW Makefiles" -DBUILD_SHARED_LIBS=OFF ..\src
  mingw32-make -j 4 tester examples
  cd ..\..
)

gradlew build
