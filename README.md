<div align="center">
<p>
    <img width="200" src="https://raw.githubusercontent.com/CCBlueX/LiquidCloud/master/LiquidBounce/liquidbounceLogo.svg">
</p>

[LiquidBounce官网](https://liquidbounce.net) |
[论坛](https://forums.ccbluex.net) |
[Guilded](https://guilded.gg/CCBlueX) |
[YouTube](https://youtube.com/CCBlueX) |
[Twitter](https://twitter.com/CCBlueX)
</div>

LiquidBounce是一个使用Fabric API的免费开源基于mixin注入的Minecraft作弊客户端。

## 问题

如果您发现任何错误或遗漏的功能，您可以通过[此处](https://github.com/CCBlueX/LiquidBounce/issues)报告给我们。

## 许可证

本项目受[GNU通用公共许可证 v3.0](https://www.gnu.org/licenses/gpl-3.0.en.html)的约束。这仅适用于直接位于此干净存储库的源代码。在开发和编译过程中，可能会使用额外的源代码，我们没有获得任何权利。这种代码不受GPL许可证的保护。

对于不熟悉许可证的人，这里是其主要要点的摘要。这绝不是法律建议，也不具有法律约束力。

*允许您做的操作：*

- 使用
- 共享
- 修改

*如果您决定使用源代码中的任何代码：*

- **您必须披露您修改后的工作的源代码以及您从该项目中提取的源代码。这意味着您不允许在闭源（甚至是混淆的）应用程序中使用该项目的代码（即使是部分）。**
- **您修改后的应用程序也必须在GPL下获得许可。**

## 设置工作空间

LiquidBounce使用Gradle，为确保其正确安装，您可以查看[Gradle的网站](https://gradle.org/install/)。还需要安装Node.js和Python以供我们的[主题](https://github.com/CCBlueX/LiquidBounce/tree/nextgen/src-theme)使用。

1. 使用 `git clone --recurse-submodules https://github.com/xiaojiangxj233/LiquidBounce-NextGen-CN` 克隆存储库。
2. 进入本地存储库。
3. 运行 `./gradlew genSources`。
4. 在首选的IDE中将文件夹打开为Gradle项目。
5. 运行客户端。

## 附加库

### Mixins

Mixins可用于在加载类之前在运行时修改类。LiquidBounce使用它将其代码注入Minecraft客户端，从而不需要包含Mojang的受版权保护的代码。如果您想了解更多，请查看其[文档](https://docs.spongepowered.org/5.1.0/en/plugin/internals/mixins.html)。

## 贡献

我们欢迎贡献。因此，如果您想支持我们，请随时更改LiquidBounce的源代码并提交拉取请求。

