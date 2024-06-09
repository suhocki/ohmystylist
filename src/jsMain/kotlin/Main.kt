package org.example

import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable


fun main() {
    renderComposable(rootElementId = "root") {
        Div({
            style {
                padding(16.px)
                fontSize(20.px)
            }
        }) {
            Text("inst: ")
            A(href = "https://www.instagram.com/oh.my.stylist/") {
                Text("oh.my.stylist")
            }
        }
    }
}