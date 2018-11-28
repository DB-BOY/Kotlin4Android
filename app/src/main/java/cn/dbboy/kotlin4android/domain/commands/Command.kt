package cn.dbboy.kotlin4android.domain.commands

/**
 * Created by wang.lichen on 2017/7/3.
 */
interface Command<out T> {
    fun execute(): T
}