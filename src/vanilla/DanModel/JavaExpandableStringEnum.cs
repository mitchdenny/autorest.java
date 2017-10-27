﻿using System.Collections.Generic;

namespace AutoRest.Java.DanModel
{
    public class JavaExpandableStringEnum : JavaEnum
    {
        public JavaExpandableStringEnum(string enumName, IEnumerable<JavaEnumValue> values)
            : base(enumName, values)
        {   
        }

        public override JavaFile GenerateJavaFile(string folderPath, string headerComment, string package, int maximumHeaderCommentWidth)
        {
            return GenerateJavaFileWithHeaderAndPackage(folderPath, headerComment, package, maximumHeaderCommentWidth)
                .Import("java.util.Collection",
                        "com.fasterxml.jackson.annotation.JsonCreator",
                        "com.microsoft.rest.ExpandableStringEnum")
                .MultipleLineComment(EnumTypeComment())
                .Block($"public final class {EnumName} extends ExpandableStringEnum<{EnumName}>", (classBlock) =>
                {
                    foreach (JavaEnumValue value in Values)
                    {
                        classBlock.SingleLineComment($"Static value {value.Value} for {EnumName}.")
                                .Line($"public static final {EnumName} {value.Name} = fromString(\"{value.Value}\");")
                                .Line();
                    }

                    classBlock.MultipleLineComment((comment) =>
                        {
                            comment.Line($"Creates or finds a {EnumName} from its string representation.")
                                .Line("@param name a name to look for")
                                .Line($"@return the corresponding {EnumName}");
                        })
                        .Line("@JsonCreator")
                        .Block($"public static {EnumName} fromString(String name)", (function) =>
                        {
                            function.Return($"fromString(name, {EnumName}.class)");
                        })
                        .Line()
                        .MultipleLineComment((comment) =>
                        {
                            comment.Line($"@return known {EnumName} values");
                        })
                        .Block($"public static Collection<{EnumName}> values()", (function) =>
                        {
                            function.Return($"values({EnumName}.class)");
                        });
                });
        }
    }
}