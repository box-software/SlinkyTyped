package typingsSlinky.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/observable/EmptyObservable", JSImport.Namespace)
@js.native
object observableEmptyObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class EmptyObservable[T] () extends js.Object
  
  /* static members */
  @js.native
  object EmptyObservable extends js.Object {
    def create[T](): js.Any = js.native
    def create[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
  
}

