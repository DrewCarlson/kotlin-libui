import libui.*
import libui.ktx.*
import libui.ktx.draw.*
import kotlinx.cinterop.convert

fun AttributedString.append(what: String, attr: Attribute, attr2: Attribute? = null) {
    val start = length
    val end = start + what.length
    append(what)
    setAttribute(attr, start, end)
    if (attr2 != null)
        setAttribute(attr2, start, end)
}

fun DrawArea.makeAttributedString() = string(
    "Drawing strings with libui is done with the uiAttributedString and uiDrawTextLayout objects.\n" +
    "uiAttributedString lets you have a variety of attributes: ").apply {
    append("font family", FamilyAttribute("Courier New"))
    append(", ")
    append("font size", SizeAttribute(18.0))
    append(", ")
    append("font weight", WeightAttribute(uiTextWeightBold))
    append(", ")
    append("font italicness", ItalicAttribute(uiTextItalicItalic))
    append(", ")
    append("font stretch", StretchAttribute(uiTextStretchCondensed))
    append(", ")
    append("text color", ColorAttribute(Color(r=0.75, g=0.25, b=0.5, a=0.75)))
    append(", ")
    append("text background color", BackgroundAttribute(Color(r=0.5, g=0.5, b=0.25, a=0.5)))
    append(", ")
    append("underline style", UnderlineAttribute(uiUnderlineSingle))
    append(", ")
    append("and ")
    append("underline color",
           UnderlineAttribute(uiUnderlineDouble),
           UnderlineColorAttribute(uiUnderlineColorCustom, Color(r=1.0, g=0.0, b=0.5, a=1.0)))
    append(". ")
    append("Furthermore, there are attributes allowing for ")
    append("special underlines for indicating spelling errors",
           UnderlineAttribute(uiUnderlineSuggestion),
           UnderlineColorAttribute(uiUnderlineColorSpelling, Color(r=0.0, g=0.0, b=0.0, a=0.0)))
    append(" (and other types of errors) ")
    append("and control over OpenType features such as ligatures (for instance, ")

    val otf = OpenTypeFeatures()
    otf.add("liga", 0)
    append("afford", FeaturesAttribute(otf))
    append(" vs. ")
    otf.add("liga", 1)
    append("afford", FeaturesAttribute(otf))
    otf.dispose()
    append(").\n")

    append("Use the controls opposite to the text to control properties of the text.")
}

fun main(args: Array<String>) = appWindow(
    title = "libui Text-Drawing Example",
    width = 640,
    height = 480
) {
    hbox {
        lateinit var font: FontButton
        lateinit var align: Combobox
        lateinit var area: DrawArea

        vbox {
            font = fontbutton {
                action { area.redraw() }
            }
            form {
                align = combobox {
                    label = "Alignment"
                    item("Left")
                    item("Center")
                    item("Right")
                    value = 0
                    action { area.redraw() }
                }
            }
        }
        area = drawarea {
            val str = makeAttributedString()
            draw {
                text(str, font.value, it.AreaWidth, align.value.convert(), 0.0, 0.0)
            }
            stretchy = true
        }
    }
}
