package typingsSlinky.atIonicCliDashFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionsMod {
  import typingsSlinky.atIonicCliDashFramework.Anon_Aliases
  import typingsSlinky.atIonicCliDashFramework.atIonicCliDashFrameworkBooleans.`true`
  import typingsSlinky.atIonicUtilsDashObject.atIonicUtilsDashObjectMod.AliasedMap
  import typingsSlinky.std.BooleanConstructor
  import typingsSlinky.std.Required
  import typingsSlinky.std.StringConstructor

  type CommandLineInputs = js.Array[String]
  type CommandMapGetter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = js.Function0[js.Promise[C]]
  type CommandOptionType = StringConstructor | BooleanConstructor
  type CommandPathItem[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = js.Tuple2[String, C | N]
  type HydratedCommandMetadata[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = M with (Anon_Aliases[C, N, M, I, O])
  type HydratedCommandMetadataOption[O /* <: CommandMetadataOption */] = Required[O]
  type ICommandMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = AliasedMap[String, CommandMapGetter[C, N, M, I, O]]
  type INamespaceMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = AliasedMap[String, NamespaceMapGetter[C, N, M, I, O]]
  type NamespaceMapGetter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = js.Function0[js.Promise[N]]
  type NamespaceMetadata = Metadata
  type ParsedArg = js.UndefOr[String | Boolean | Null | js.Array[String]]
  type Validator = js.Function2[/* input */ js.UndefOr[String], /* key */ js.UndefOr[String], `true` | String]
}
