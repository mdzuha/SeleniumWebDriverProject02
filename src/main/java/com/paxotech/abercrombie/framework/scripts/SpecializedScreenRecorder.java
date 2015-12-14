/**
 * 
 */
package com.paxotech.abercrombie.framework.scripts;

import java.awt.AWTException;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.monte.media.Format;
import org.monte.media.Registry;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import static org.monte.media.FormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;




import java.awt.Dimension;

/**
 * @author Masihur
 *
 */
public class SpecializedScreenRecorder extends ScreenRecorder{

//	need TSCC Codec installed
//	from http://www.techsmith.com/download.html
	
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static Rectangle captureSize = new Rectangle(0, 0, screenSize.width, screenSize.height)
;
	private static GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
	
	private static Format fileFormat = new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI);
	
	private static Format screenFormat = new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, 
			CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24, FrameRateKey, 
			Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, 15*60);
	private static Format mouseFormat = new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30));
	
	private String fileNameStartWith;
	
	public SpecializedScreenRecorder(File movieFolder, String fileNameStartWith) throws IOException, AWTException{
		this(gc, captureSize, fileFormat, screenFormat, mouseFormat,null, movieFolder, fileNameStartWith);
	}
	public SpecializedScreenRecorder(String  movieFolder, String fileNameStartWith) throws IOException, AWTException{
		this(gc, captureSize, fileFormat, screenFormat, mouseFormat,null, new File(movieFolder), fileNameStartWith);
	}
	
	public SpecializedScreenRecorder(GraphicsConfiguration cfg, Rectangle captureArea, Format fileFormat, Format screenFormat, Format mouseFormat, Format audioFormat,
			File movieFolder, String fileNameStartWith) throws IOException, AWTException{
		super(cfg, captureArea, fileFormat,screenFormat, mouseFormat, audioFormat, movieFolder);
		this.fileNameStartWith = fileNameStartWith;
	}
	
	@Override
	protected File createMovieFile(Format fileFormat) throws IOException{
		if(!movieFolder.exists()){
			movieFolder.mkdirs();
		}
		else if(!movieFolder.isDirectory()){
			throw new IOException("\"" + movieFolder + "\" is not a directory");
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		return new File(movieFolder, fileNameStartWith + "-" + dateFormat.format(new Date())+"." +Registry.getInstance().getExtension(fileFormat));
		
		
		
		
	}


}
