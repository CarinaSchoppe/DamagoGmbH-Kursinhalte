package tag4.aufgaben.factory.application;

import java.util.Map;
import java.util.function.Supplier;
import tag4.aufgaben.factory.domain.Document;

public class DocumentImportService {


  private final Map<String, Supplier<Importer>> importerRegistry = Map.of(
      "xml", XmlImporter::new,
      "json", JsonImporter::new,
      "csv", CsvImporter::new
  );

  public Document importFile(String filename, String filecontent) {
    Importer importer = getImporterFor(filename);
    return importer.importDocument(filecontent);
  }


  private Importer getImporterFor(String filename) {
    String extension = filename.substring(filename.lastIndexOf(".") + 1);
    Supplier<Importer> importerSupplier = importerRegistry.get(extension);
    if (importerSupplier == null) {
      throw new IllegalArgumentException("Unbekannter Dateityp: " + extension);
    }
    return importerSupplier.get(); //<- importer wird erzeugt
  }

  private Importer chooseImporterByFilename(String filename) {
    String extension = filename.substring(filename.lastIndexOf(".") + 1);

    return switch (extension) {
      case "xml" -> new XmlImporter();
      case "json" -> new JsonImporter();
      case "csv" -> new CsvImporter();
      default -> throw new IllegalArgumentException("Unbekannter Dateityp: " + extension);
    };
  }
}