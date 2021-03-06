package typingsSlinky.yadda.libMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.yadda.libLocalisationLanguageMod.Vocabulary
import typingsSlinky.yadda.libLocalisationLanguageMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "localisation")
@js.native
object localisation extends js.Object {
  @js.native
  class Language[TLibrary /* <: typingsSlinky.yadda.libLocalisationLanguageMod.Library */] protected ()
    extends typingsSlinky.yadda.libLocalisationMod.Language[TLibrary] {
    def this(name: String, vocabulary: Vocabulary) = this()
  }
  
  @js.native
  object Chinese
    extends TopLevel[^[typingsSlinky.yadda.libLocalisationChineseMod.Library]]
  
  @js.native
  object Dutch
    extends TopLevel[^[typingsSlinky.yadda.libLocalisationDutchMod.Library]]
  
  @js.native
  object English
    extends TopLevel[^[typingsSlinky.yadda.libLocalisationEnglishMod.Library]]
  
  @js.native
  object French
    extends TopLevel[^[typingsSlinky.yadda.libLocalisationFrenchMod.Library]]
  
  @js.native
  object German
    extends TopLevel[^[typingsSlinky.yadda.libLocalisationGermanMod.Library]]
  
  @js.native
  object Norwegian
    extends TopLevel[^[typingsSlinky.yadda.libLocalisationNorwegianMod.Library]]
  
  @js.native
  object Pirate
    extends TopLevel[^[typingsSlinky.yadda.libLocalisationPirateMod.Library]]
  
  @js.native
  object Polish
    extends TopLevel[^[typingsSlinky.yadda.libLocalisationPolishMod.Library]]
  
  @js.native
  object Portuguese
    extends TopLevel[^[typingsSlinky.yadda.libLocalisationPortugueseMod.Library]]
  
  @js.native
  object Russian
    extends TopLevel[^[typingsSlinky.yadda.libLocalisationRussianMod.Library]]
  
  @js.native
  object Spanish
    extends TopLevel[^[typingsSlinky.yadda.libLocalisationSpanishMod.Library]]
  
  @js.native
  object Ukrainian
    extends TopLevel[^[typingsSlinky.yadda.libLocalisationUkrainianMod.Library]]
  
  @js.native
  object default
    extends TopLevel[^[typingsSlinky.yadda.libLocalisationEnglishMod.Library]]
  
}

