import kotlinx.cinterop.*
import libui.ktx.*

val `andlabs_32x32test_24june2016.png` = ImageData(32, 32, 128, cValuesOf(
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(),
    0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(),
    0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(),
    0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(),
    0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFE560FC.toInt(),
    0xFFE560FC.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFE560FC.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFE560FC.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFE560FC.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFE560FC.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(),
    0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(),
    0xFFFF4079.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFE560FC.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFE560FC.toInt(),
    0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(),
    0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(),
    0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFE560FC.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFE560FC.toInt(),
    0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFE560FC.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFE560FC.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFE560FC.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFE560FC.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFE560FC.toInt(),
    0xFFE560FC.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(),
    0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(),
    0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(),
    0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFF4079.toInt(),
    0xFFFF4079.toInt(), 0xFFFF4079.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(), 0xFF8AC3FF.toInt(),
    0xFF8AC3FF.toInt(), 0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFF8AC3FF.toInt(), 0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(), 0xFF8AC3FF.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFF8AC3FF.toInt(), 0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(), 0xFF8AC3FF.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF8AC3FF.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(),
    0xFFFFFB43.toInt(), 0xFFFFFB43.toInt(), 0xFF8AC3FF.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(),
    0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt(), 0xFF89C57C.toInt()
))
