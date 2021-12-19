import CatFactLib from "./vendor/kmCatFact.js"

console.log(CatFactLib);

function makeContinuation(fn) {
  return {
    context: () => null,
    resumeWith: (fact) => fn(fact)
  }
}


const service = new CatFactLib.me.puncha.CatFactService();
const repo = new CatFactLib.me.puncha.CatFactRepository(service);
console.log(repo.welcome());

const a = repo.getFact(makeContinuation(console.log), true);
console.dir(a);

