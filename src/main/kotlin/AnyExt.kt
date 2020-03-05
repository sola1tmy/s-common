/**
 * @author : sola_tmy
 * @since : 2020/3/5, 周四
 * @description:
 **/
fun <T, R> T.map(mapper: T.() -> R): R {
    return mapper.invoke(this)
}