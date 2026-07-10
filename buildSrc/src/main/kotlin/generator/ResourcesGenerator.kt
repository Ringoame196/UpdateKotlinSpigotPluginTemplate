package generator

import java.io.File

class ResourcesGenerator(private val projectDir: File) {
	private val resource = projectDir.resolve("src/main/resources/").apply(File::mkdirs)
	fun generate() {
		makeConfig()
		makeMessageFile()
	}

	private fun makeConfig() {
		GeneratorUtil.makeFile(resource,"config.yml","")
	}

	private fun makeMessageFile() {
		GeneratorUtil.makeFile(resource, "message.yml", "")
	}
}