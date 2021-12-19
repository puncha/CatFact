import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import me.puncha.CatFactRepository;
import me.puncha.CatFactService;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello!");
        CatFactService catFactService = new CatFactService();
        CatFactRepository catFactRepository = new CatFactRepository(catFactService);

        System.out.println(catFactRepository.welcome());

        BuildersKt.runBlocking((CoroutineContext) Dispatchers.getDefault(), (ctx, continuation) -> {
            return catFactRepository.getFact(new Continuation<String>() {
                @NotNull
                @Override
                public CoroutineContext getContext() {
                    return EmptyCoroutineContext.INSTANCE;
                }

                @Override
                public void resumeWith(@NotNull Object o) {
                    System.out.println(o);
                }
            });
        });
    }
}
