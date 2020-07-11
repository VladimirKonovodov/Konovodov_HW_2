package model

class Profile(
    val id: Int,
    val login: String,
    val name: String,
    val surname: String,
    val status: String,
    val avatar: String/*BitMap*/
) {
    var fullname: String = ""
        get() {
            return "к доске пойдет " + name + " " + surname
        }


}