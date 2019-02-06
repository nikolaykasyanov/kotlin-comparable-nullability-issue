package whatever

public class SomeClass(val value: Int): Comparable<SomeClass> {
    override fun compareTo(other: SomeClass) = value.compareTo(other.value)
}
