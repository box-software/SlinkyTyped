package typingsSlinky.ecol

import typingsSlinky.ecol.libBasicIEventDispatcherMod.IEventDispatcher
import typingsSlinky.tstl.baseIteratorIteratorMod.Iterator
import typingsSlinky.tstl.tstlMod.base.Container
import typingsSlinky.tstl.tstlMod.base.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/basic/ICollection", JSImport.Namespace)
@js.native
object libBasicICollectionMod extends js.Object {
  @js.native
  trait ICollection[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */]
    extends typingsSlinky.tstl.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT, T]
       with IEventDispatcher[T, SourceT, IteratorT, ReverseT] {
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def begin(): Iterator[T, SourceT, IteratorT, ReverseT, T] = js.native
    /**
      * Test whether container is empty.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def empty(): Boolean = js.native
    /**
      * Iterator to the end.
      *
      * @return Iterator to the end.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def end(): Iterator[T, SourceT, IteratorT, ReverseT, T] = js.native
    /**
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def push(items: T*): Double = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def rbegin(): ReverseT = js.native
    def refresh(): Unit = js.native
    def refresh(first: IteratorT, last: IteratorT): Unit = js.native
    def refresh(it: IteratorT): Unit = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def rend(): ReverseT = js.native
    /**
      * Number of elements in the container.
      */
    /* InferMemberOverrides */
    override def size(): Double = js.native
  }
  
}

