cmake_minimum_required(VERSION 3.21)
project(winCatFactConsole)

set(CMAKE_CXX_STANDARD 20)


# Dynamic Libs
link_directories("../kmCatFact/build/bin/native/debugShared/")

add_executable(winCatFactConsole main.cpp)

# static link libgcc & libstdc++
# https://stackoverflow.com/questions/6404636/libstdc-6-dll-not-found
# https://stackoverflow.com/questions/38694058/cmake-linking-statically-against-libgcc-and-libstdc-into-a-shared-library
target_link_libraries(winCatFactConsole -static-libgcc -static-libstdc++)
target_link_libraries(winCatFactConsole libkmCatFact.dll)