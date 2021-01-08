package edu.slapoguzov.emodetect.core

fun <T> Class<T>.readResource(resourceName: String): String {
    return this.classLoader.getResourceAsStream(resourceName).reader().readText()
}

fun <T> Class<T>.readResourceByLines(resourceName: String): List<String> {
    return this.classLoader.getResourceAsStream(resourceName).reader().readLines()
}
 private tailrec fun _process2(emotions: MutableSet<EmotionType>): MutableSet<EmotionType> {
        val result = emotions.toMutableSet()
        val rule = rules.find { result.containsAll(it.first) }
                ?: return result
        logger.info { "apply rule: ${rule.first} to ${rule.second}" }
        result.removeAll(rule.first)
        result.add(rule.second)
        return _process(result)
    }
 private tailrec fun _process2(emotions: MutableSet<EmotionType>): MutableSet<EmotionType> {
        val result = emotions.toMutableSet()
        val rule = rules.find { result.containsAll(it.first) }
                ?: return result
        logger.info { "apply rule: ${rule.first} to ${rule.second}" }
        result.removeAll(rule.first)
        result.add(rule.second)
        return _process(result)
    }
