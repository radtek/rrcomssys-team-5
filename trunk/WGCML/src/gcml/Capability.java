/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Capability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gcml.GcmlPackage#getCapability()
 * @model extendedMetaData="name='Capability'"
 * @generated
 */
public enum Capability implements Enumerator {
	/**
	 * The '<em><b>Text File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_FILE(0, "TextFile", "TextFile"),

	/**
	 * The '<em><b>Binary File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY_FILE(1, "BinaryFile", "BinaryFile"),

	/**
	 * The '<em><b>Stream File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREAM_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	STREAM_FILE(2, "StreamFile", "StreamFile"),

	/**
	 * The '<em><b>Non Stream File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_STREAM_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	NON_STREAM_FILE(3, "NonStreamFile", "NonStreamFile"),

	/**
	 * The '<em><b>Audio File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO_FILE(4, "AudioFile", "AudioFile"),

	/**
	 * The '<em><b>Video File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_FILE(5, "VideoFile", "VideoFile"),

	/**
	 * The '<em><b>AV File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AV_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	AV_FILE(6, "AVFile", "AVFile"),

	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(7, "Text", "Text"),

	/**
	 * The '<em><b>Live Stream</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIVE_STREAM_VALUE
	 * @generated
	 * @ordered
	 */
	LIVE_STREAM(8, "LiveStream", "LiveStream"),

	/**
	 * The '<em><b>Live Audio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIVE_AUDIO_VALUE
	 * @generated
	 * @ordered
	 */
	LIVE_AUDIO(9, "LiveAudio", "LiveAudio"),

	/**
	 * The '<em><b>Live Video</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIVE_VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	LIVE_VIDEO(10, "LiveVideo", "LiveVideo"),

	/**
	 * The '<em><b>Live AV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIVE_AV_VALUE
	 * @generated
	 * @ordered
	 */
	LIVE_AV(11, "LiveAV", "LiveAV");

	/**
	 * The '<em><b>Text File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT_FILE
	 * @model name="TextFile"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_FILE_VALUE = 0;

	/**
	 * The '<em><b>Binary File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Binary File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY_FILE
	 * @model name="BinaryFile"
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FILE_VALUE = 1;

	/**
	 * The '<em><b>Stream File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stream File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STREAM_FILE
	 * @model name="StreamFile"
	 * @generated
	 * @ordered
	 */
	public static final int STREAM_FILE_VALUE = 2;

	/**
	 * The '<em><b>Non Stream File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Stream File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_STREAM_FILE
	 * @model name="NonStreamFile"
	 * @generated
	 * @ordered
	 */
	public static final int NON_STREAM_FILE_VALUE = 3;

	/**
	 * The '<em><b>Audio File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Audio File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUDIO_FILE
	 * @model name="AudioFile"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_FILE_VALUE = 4;

	/**
	 * The '<em><b>Video File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Video File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIDEO_FILE
	 * @model name="VideoFile"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_FILE_VALUE = 5;

	/**
	 * The '<em><b>AV File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AV File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AV_FILE
	 * @model name="AVFile"
	 * @generated
	 * @ordered
	 */
	public static final int AV_FILE_VALUE = 6;

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model name="Text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 7;

	/**
	 * The '<em><b>Live Stream</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Live Stream</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIVE_STREAM
	 * @model name="LiveStream"
	 * @generated
	 * @ordered
	 */
	public static final int LIVE_STREAM_VALUE = 8;

	/**
	 * The '<em><b>Live Audio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Live Audio</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIVE_AUDIO
	 * @model name="LiveAudio"
	 * @generated
	 * @ordered
	 */
	public static final int LIVE_AUDIO_VALUE = 9;

	/**
	 * The '<em><b>Live Video</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Live Video</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIVE_VIDEO
	 * @model name="LiveVideo"
	 * @generated
	 * @ordered
	 */
	public static final int LIVE_VIDEO_VALUE = 10;

	/**
	 * The '<em><b>Live AV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Live AV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIVE_AV
	 * @model name="LiveAV"
	 * @generated
	 * @ordered
	 */
	public static final int LIVE_AV_VALUE = 11;

	/**
	 * An array of all the '<em><b>Capability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Capability[] VALUES_ARRAY =
		new Capability[] {
			TEXT_FILE,
			BINARY_FILE,
			STREAM_FILE,
			NON_STREAM_FILE,
			AUDIO_FILE,
			VIDEO_FILE,
			AV_FILE,
			TEXT,
			LIVE_STREAM,
			LIVE_AUDIO,
			LIVE_VIDEO,
			LIVE_AV,
		};

	/**
	 * A public read-only list of all the '<em><b>Capability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Capability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Capability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Capability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Capability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Capability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Capability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Capability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Capability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Capability get(int value) {
		switch (value) {
			case TEXT_FILE_VALUE: return TEXT_FILE;
			case BINARY_FILE_VALUE: return BINARY_FILE;
			case STREAM_FILE_VALUE: return STREAM_FILE;
			case NON_STREAM_FILE_VALUE: return NON_STREAM_FILE;
			case AUDIO_FILE_VALUE: return AUDIO_FILE;
			case VIDEO_FILE_VALUE: return VIDEO_FILE;
			case AV_FILE_VALUE: return AV_FILE;
			case TEXT_VALUE: return TEXT;
			case LIVE_STREAM_VALUE: return LIVE_STREAM;
			case LIVE_AUDIO_VALUE: return LIVE_AUDIO;
			case LIVE_VIDEO_VALUE: return LIVE_VIDEO;
			case LIVE_AV_VALUE: return LIVE_AV;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Capability(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Capability
