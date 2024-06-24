package streamAPI.B_sucelja;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

@SuppressWarnings("rawtypes")
abstract class SuceljeStreamBilj implements Stream{

	public abstract Iterator iterator();

	public abstract Spliterator spliterator();

	public abstract boolean isParallel();

	public abstract BaseStream sequential();

	public abstract BaseStream parallel();

	public abstract BaseStream unordered();

	public abstract BaseStream onClose(Runnable closeHandler);

	public abstract void close();

	//IMPORTANT
	public abstract Stream filter(Predicate predicate);

	public abstract Stream map(Function mapper);

	public abstract IntStream mapToInt(ToIntFunction mapper);

	public abstract LongStream mapToLong(ToLongFunction mapper);

	public abstract DoubleStream mapToDouble(ToDoubleFunction mapper);

	public abstract Stream flatMap(Function mapper);

	public abstract IntStream flatMapToInt(Function mapper);

	public abstract LongStream flatMapToLong(Function mapper);

	public abstract DoubleStream flatMapToDouble(Function mapper);

	public abstract Stream distinct();

	public abstract Stream sorted();

	//IMPORTANT
	public abstract Stream sorted(Comparator comparator);

	public abstract Stream peek(Consumer action);

	public abstract Stream limit(long maxSize);

	public abstract Stream skip(long n);

	//IMPORTANT
	public abstract void forEach(Consumer action);

	public abstract void forEachOrdered(Consumer action);

	public abstract Object[] toArray();

	public abstract Object[] toArray(IntFunction generator);

	public abstract Object reduce(Object identity, BinaryOperator accumulator);

	public abstract Optional reduce(BinaryOperator accumulator);

	public abstract Object reduce(Object identity, BiFunction accumulator, BinaryOperator combiner);

	public abstract Object collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner);

	public abstract Object collect(Collector collector);

	public abstract Optional min(Comparator comparator);

	public abstract Optional max(Comparator comparator);

	public abstract long count();

	public abstract boolean anyMatch(Predicate predicate);

	public abstract boolean allMatch(Predicate predicate);

	public abstract boolean noneMatch(Predicate predicate);

	public abstract Optional findFirst();

	public abstract Optional findAny();

}
