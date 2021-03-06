package typingsSlinky.draftDashConvert.draftDashConvertMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.draftDashConvert.Anon_Data
import typingsSlinky.draftDashConvert.Anon_Entity
import typingsSlinky.draftDashConvert.draftDashConvertBooleans.`false`
import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftBlockType
import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftInlineStyleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConvertFromHTMLConfig extends js.Object {
  // Block styles:
  var htmlToBlock: js.UndefOr[
    js.Function2[/* nodeName */ String, /* node */ HTMLElement, DraftBlockType | Anon_Data | `false`]
  ] = js.undefined
  // Html entities
  var htmlToEntity: js.UndefOr[
    js.Function6[
      /* nodeName */ String, 
      /* node */ HTMLElement, 
      /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], 
      /* getEntity */ js.Function1[
        /* key */ EntityKey, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
      ], 
      /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      Unit
    ]
  ] = js.undefined
  // Inline styles:
  var htmlToStyle: js.UndefOr[
    js.Function2[/* nodeName */ String, /* node */ HTMLElement, DraftInlineStyleType]
  ] = js.undefined
  // Text entities
  var textToEntity: js.UndefOr[
    js.Function5[
      /* text */ String, 
      /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], 
      /* getEntity */ js.Function1[
        /* key */ EntityKey, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
      ], 
      /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      js.Array[Anon_Entity]
    ]
  ] = js.undefined
}

object IConvertFromHTMLConfig {
  @scala.inline
  def apply(
    htmlToBlock: (/* nodeName */ String, /* node */ HTMLElement) => DraftBlockType | Anon_Data | `false` = null,
    htmlToEntity: (/* nodeName */ String, /* node */ HTMLElement, /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], /* getEntity */ js.Function1[
      /* key */ EntityKey, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
    ], /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit]) => Unit = null,
    htmlToStyle: (/* nodeName */ String, /* node */ HTMLElement) => DraftInlineStyleType = null,
    textToEntity: (/* text */ String, /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], /* getEntity */ js.Function1[
      /* key */ EntityKey, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
    ], /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit]) => js.Array[Anon_Entity] = null
  ): IConvertFromHTMLConfig = {
    val __obj = js.Dynamic.literal()
    if (htmlToBlock != null) __obj.updateDynamic("htmlToBlock")(js.Any.fromFunction2(htmlToBlock))
    if (htmlToEntity != null) __obj.updateDynamic("htmlToEntity")(js.Any.fromFunction6(htmlToEntity))
    if (htmlToStyle != null) __obj.updateDynamic("htmlToStyle")(js.Any.fromFunction2(htmlToStyle))
    if (textToEntity != null) __obj.updateDynamic("textToEntity")(js.Any.fromFunction5(textToEntity))
    __obj.asInstanceOf[IConvertFromHTMLConfig]
  }
}

