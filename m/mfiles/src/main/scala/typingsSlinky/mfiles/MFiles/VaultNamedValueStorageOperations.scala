package typingsSlinky.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.INamedValues
import typingsSlinky.mfiles.IStrings
import typingsSlinky.mfiles.IVaultNamedValueStorageOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultNamedValueStorageOperations")
@js.native
class VaultNamedValueStorageOperations () extends IVaultNamedValueStorageOperations {
  /* CompleteClass */
  override def GetNamedValues(NamedValueType: MFNamedValueType, Namespace: String): INamedValues = js.native
  /* CompleteClass */
  override def RemoveNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValueNames: IStrings): Unit = js.native
  /* CompleteClass */
  override def SetNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValues: INamedValues): Unit = js.native
}

@JSGlobal("MFiles.VaultNamedValueStorageOperations")
@js.native
object VaultNamedValueStorageOperations extends Instantiable0[IVaultNamedValueStorageOperations]

