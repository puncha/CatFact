#include <iostream>
#include <windows.h>
#include "../kmCatFact/build/bin/native/debugShared/libkmCatFact_api.h"

using namespace std;

void success(const char *fact) {
    cout << fact << endl;
}

void failure(void *fact) {
    cout << "Failure" << endl;
}

int main() {
    std::cout << "Hello!" << std::endl;

    libkmCatFact_ExportedSymbols *lib = libkmCatFact_symbols();
    const auto puncha = lib->kotlin.root.me.puncha;
    auto catFactService = puncha.CatFactService.CatFactService();
    auto catFactRepo = puncha.CatFactRepository.CatFactRepository(catFactService);

    // call testString() to return a string
    auto testString = puncha.CatFactRepository.welcome(catFactRepo);
    std::cout << testString << std::endl;

    // call suspect function to make a HTTP request
    // I don't know how to
    puncha.fetchFact(catFactRepo);
    Sleep(3000);

    // dispose resources
    lib->DisposeStablePointer(catFactRepo.pinned);
    lib->DisposeStablePointer(catFactService.pinned);
    return 0;
}
