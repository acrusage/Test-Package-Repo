package eu.stefankreiner.libraries.kotlinmp.compose.navigation

import eu.stefankreiner.libraries.kotlin.compose.ui.navigation.TypedNamedNavArgument

class TypedNamedNavArgumentValue<T>(
    val navType: TypedNamedNavArgument<T>,
    val value: T?,
)