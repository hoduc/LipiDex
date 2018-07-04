package app;
import java.net.URL;

public class Resource {
	// Icons
	private static String RESOURCE_BASE = "resource";
	private static String RESOURCE_ICONS = "icons";
	
	public static String LIBRARIES = "libraries";
	public static String MSP_FILES = "msp_files";
	public static String BACKUP = "backup";
	
	
	// menu
	public static String MENU_SEPARATOR = "/menu_separator.png";
	public static String SPEAKTRUM_SEARCHER_MENU_ICON = "/ss_menu.png";
	public static String SPECTRUM_SEARCHER_OPEN_MENU_ICON = "/ss_menu_open.png";
	public static String PEAK_FINDER_MENU_ICON = "/pf_menu.png";
	public static String PEAK_FINDER_OPEN_MENU_ICON = "/pf_menu_open.png";
	public static String LIB_GEN_MENU_ICON = "/lg_menu.png";
	public static String LIB_GEN_OPEN_MENU_ICON = "/lg_menu_open.png";
	public static String SPECTRUM_GEN_MENU_ICON = "/sg_menu.png";
	public static String SPECTRUM_GEN_OPEN_MENU_ICON = "/sg_menu_open.png";
	
	public static String LIPIDEX_LOGO_ICON = "/LipiDex_Logo.png";
	public static String COON_LAB_LOGO_ICON = "/Coon_Lab_Logo.png";
	public static String COON_LAB_LOGO_HOVER_ICON = "/Coon_Lab_Logo_Hover.png";
	public static String COON_LAB_URL = "http://coonlabs.com/";
	
	// main icons
	public static String LIB_GEN_ICON = "/library_generator_icon.png";
	public static String LIB_GEN_ICON_16 = "/lg_16_icon.png";
	public static String LIB_GEN_GRAY_ICON = "/library_generator_icon_gray.png";
	public static String SPECTRUM_GEN_ICON = "/spectrum_generator_icon.png";
	public static String SPECTRUM_GEN_ICON_16 = "/sg_16_icon.png";
	public static String SPECTRUM_GEN_GRAY_ICON = "/spectrum_generator_icon_gray.png";
	
	public static String SPECTRUM_SEARCHER_ICON = "/spectrum_searcher_icon.png";
	public static String SPECTRUM_SEARCHER_ICON_16 = "/ss_16_icon.png";
	public static String SPEAKTRUM_SEARCHER_GRAY_ICON = "/spectrum_searcher_icon_gray.png";
	public static String PEAK_FINDER_ICON = "/peak_finder_icon.png";
	public static String PEAK_FINDER_ICON_16 = "/pf_16_icon.png";
	public static String PEAK_FINDER_GRAY_ICON = "/peak_finder_icon_gray.png";
	public static String PEAK_FINDER_POSSIBLE_ADDUCTS = "Possible_Adducts.csv";
	
	public static String BOOK_ICON_WHITE = "/Book_Icon_White.png";
	public static String LEAF_ICON = "/Leaf_Icon.png";
	public static String LIPID_ICON_BLUE_48 = "/LipiDex_Icon_Blue_48.png";
	public static String LIPID_ICON_BLUE_16 = "/LipiDex_Icon_Blue_16.png";
	
	
	
	private static ClassLoader classLoader = Resource.class.getClassLoader();
	
	public static URL getResource(String fileName) {
		return classLoader.getResource(fileName);
	}
	
	public static String getResourcePath(String fileName) {
		return classLoader.getResource(fileName).getPath();
	}
	
	public static URL getIcon(String fileName) {
		return classLoader.getResource(RESOURCE_ICONS + fileName);
	}
	
	public static String getIconPath(String fileName) {
		return classLoader.getResource(RESOURCE_ICONS + fileName).getPath();
	}
}