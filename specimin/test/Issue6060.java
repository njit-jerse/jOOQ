import java.util.Spliterator;

public interface Issue6060<R> extends Iterable<R> {
  default Spliterator<R> spliterator() {
    return Iterable.super.spliterator();
  }
}