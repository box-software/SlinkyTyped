package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typingsSlinky.mobx.libTypesObservablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/ByNameReferenceProperty", JSImport.Namespace)
@js.native
object distSdkInternalPropertiesByNameReferencePropertyMod extends js.Object {
  @js.native
  class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends AbstractProperty[js.Array[T], IList[String]] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      value: js.Array[T],
      _targetType: String
    ) = this()
    @JSName("parent")
    var parent_ByNameReferenceListProperty: AbstractElement = js.native
    def qualifiedNames(): js.Array[String] = js.native
    def targetType(): String = js.native
    def updateWithRawValue(value: js.Array[String]): Unit = js.native
  }
  
  @js.native
  class ByNameReferenceProperty[T /* <: IAbstractElement */] protected () extends AbstractProperty[T | Null, IObservableValue[String | Null]] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
    @JSName("parent")
    var parent_ByNameReferenceProperty: AbstractElement = js.native
    def qualifiedName(): String | Null = js.native
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    def targetType(): String = js.native
    def updateWithRawValue(value: String): Unit = js.native
  }
  
}

