import { defineConfig } from "astro/config";
import starlight from "@astrojs/starlight";
import react from "@astrojs/react";
import tailwind from "@astrojs/tailwind";

// https://astro.build/config
export default defineConfig({
  site: "https://matterv.com",
  integrations: [
    starlight({
      title: "MatterV",
      description:
        "MatterV, a simple, modern and open source Virtual Machine management platform.",
      head: [
        {
          // Google tag (gtag.js)
          tag: 'script',
          attrs: {
            src: 'https://www.googletagmanager.com/gtag/js?id=G-SZSZH3XD84',
            async: true,
          },
        },
        {
          // Google Analytics configuration
          tag: 'script',
          content: `
            window.dataLayer = window.dataLayer || [];
            function gtag(){dataLayer.push(arguments);}
            gtag('js', new Date());
            gtag('config', 'G-SZSZH3XD84');
          `,
        },
      ],
      customCss: ["./src/styles/tailwind.css"],
      components: {
        SocialIcons: "./src/components/custom-navbar-links.astro",
        ThemeProvider: "./src/components/theme-provider.astro",
        ThemeSelect: "./src/components/theme-provider.astro",
      },
      lastUpdated: true,
      sidebar: [
        {
          label: "Getting Started",
          items: [
            { label: "Why MatterV?", link: "/en/getting-started/matterv" },
          ],
        },
        {
          label: "Installation",
          items: [
            {
              label: "Installation Overview",
              link: "/en/installation/install-overview",
            },
            {
              label: "Install MatterV Cluster",
              link: "/en/installation/install-cluster",
            },
            {
              label: "Install MatterV Host",
              link: "/en/installation/install-host",
            },
          ],
        },
        {
          label: "Configuration",
          items: [
            { label: "Setup MatterV Host Network", link: "/en/configuration/network" },
            { label: "Setup MatterV Cluster", link: "/en/configuration/cluster" },

          ],
        },
        {
          label: "Operation",
          items: [
            { label: "Create a VM", link: "/en/operation/create-vm" },

          ],
        },
      ],
    }),
    react(),
    tailwind({ applyBaseStyles: false }),
  ],
  image: {
    service: {
      entrypoint: "astro/assets/services/sharp",
    },
  },
  build: {
    assets: 'assets', // Instead of '_astro'
  },
});
